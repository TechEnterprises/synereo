package com.protegra_ati.agentservices.core.messages.verifier

import com.protegra_ati.agentservices.store.mongo.usage.AgentKVDBMongoScope.acT._
import com.protegra_ati.agentservices.core.schema._
import com.protegra_ati.agentservices.core.messages._
import com.protegra_ati.agentservices.core.schema._
import reflect.BeanProperty

/* User: jviolago
*/

case class GetClaimRequest(override val ids: Identification, override val eventKey: EventKey, claimObject:String, claimField:String, verifierList:List[Verifier], relyingAgentDescription:String) extends Message() with Request {
  def this() = this(null, null, null, null, null, null)

  override def channel = Channel.Verify
  @BeanProperty var notifyCnxn:AgentCnxnProxy = null
}

