/**
 *
 */
package com.fsdev.scw

import org.apache.wicket.protocol.http.WebApplication
import com.fsdev.scw.push.SampleScheduling
import org.apache.wicket.atmosphere.EventBus

/**
 * @author kjozsa
 */
class WicketApplication extends WebApplication with Logging with SampleScheduling {
  lazy val eventBus = new EventBus(this)

  override def getHomePage() = classOf[MainPage]
}
