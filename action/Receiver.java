package com.creditcore.ledger.openacc.action;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.creditcore.ledger.api.dispatch.constatant.DispatchConst;
import com.creditcore.ledger.api.dispatch.entity.beans.IssueDispatch;
import com.creditcore.ledger.api.dispatch.entity.tbl.PubServiceFlow;
import com.creditcore.ledger.api.dispatch.service.PubServiceFlowService;
import com.creditcore.ledger.api.rabbitmq.action.Sender;
import com.creditcore.ledger.api.rabbitmq.conf.RabbitmqProperties;
import com.creditcore.ledger.openacc.service.OpenAccService;

import net.sf.json.JSONObject;

/** 
* @ClassName: DispatchServiceReceiver 
* @DescriptiWon: Dispatch 接收 
* @author xiubb
* @date 2017年7月24日 下午1:38:20 
*  
*/
@Service
@RefreshScope
public class Receiver { 

	/*
	private final Logger logger = LoggerFactory.getLogger(Receiver.class);
	
	@Autowired
	private PubServiceFlowService pubServiceFlowService;
	
	@Autowired
	private Sender sender;
	
	@Autowired
	private RabbitmqProperties rabbitmqProperties;

	@Autowired
	private OpenAccService consSyncService;
	
	
	public void pre(String in) throws Exception{
		logger.info(rabbitmqProperties.getQueue_name() +" receive :[" + in + "]");
		IssueDispatch issueDispatch = pubServiceFlowService.convertFromJsonString(in);
		
		//判断上一个处理步骤是否成功
		if (!pubServiceFlowService.isPreServiceIdSuc(issueDispatch)){
			throw new Exception("Previous serviceid fail!");
		}
					
		//INIT
		PubServiceFlow pubServiceFlow = new PubServiceFlow();
		pubServiceFlow.setId(issueDispatch.getDispatchSequenceNumber());
		pubServiceFlow.setRunstarttime(new Timestamp(System.currentTimeMillis()));
		pubServiceFlow.setFlowstatus(DispatchConst.FlowStatus.INIT);
		pubServiceFlowService.chgPubserviceFlow(pubServiceFlow);
		
	}
	
	public void end(String in) throws Exception{
		//SUCC
		IssueDispatch issueDispatch = pubServiceFlowService.convertFromJsonString(in);
		PubServiceFlow pubServiceFlow = new PubServiceFlow();
		pubServiceFlow.setId(issueDispatch.getDispatchSequenceNumber());
		pubServiceFlow.setRunendtime(new Timestamp(System.currentTimeMillis()));
		pubServiceFlow.setFlowstatus(DispatchConst.FlowStatus.SUCC);
		pubServiceFlowService.chgPubserviceFlow(pubServiceFlow);
		
		//流控处理下一个消息
	    if (!StringUtils.isEmpty(pubServiceFlowService.getNextId(issueDispatch))) {
	    	issueDispatch.setDispatchSequenceNumber(Integer.valueOf(pubServiceFlowService.getNextId(issueDispatch)));
			logger.info("get next seqno is：[" + JSONObject.fromObject(issueDispatch).toString() + "]");
			//sender.sendMsg("", JSONObject.fromObject(issueDispatch).toString());
		}
	}
	
	@RabbitHandler
    public void receive(String in)  throws Exception {
		try {
			//前期处理
			pre(in);

			//业务人员编码↓
			//处理
			consSyncService.hello(in);
			//业务人员编码↑
			
			//后续处理
			end(in);
		}catch (Exception e){
			logger.error("RabbitHandler Error ！" );
			e.printStackTrace();
		}
		
   }
*/
}
