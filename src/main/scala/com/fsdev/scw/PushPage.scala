/**
 *
 */
package com.fsdev.scw

import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.ajax.AjaxRequestTarget
import org.apache.wicket.atmosphere.Subscribe
import org.apache.wicket.model.Model
import java.util.Date
import java.text.DateFormat

/**
 * @author kjozsa
 */
class PushPage extends WebPage with Logging {
  val pushNumber = new Label("pushNumber", new Model)
  pushNumber.setOutputMarkupId(true)
  add(pushNumber)

  val pushString = new Label("pushString", new Model)
  pushString.setOutputMarkupId(true)
  add(pushString)

  @Subscribe
  def update(target: AjaxRequestTarget, event: OneEvent) {
    pushNumber.setDefaultModelObject(event)
    target.add(pushNumber)
  }

  @Subscribe
  def update2(target: AjaxRequestTarget, event: OtherEvent) {
    pushString.setDefaultModelObject(event)
    target.add(pushString)
  }
}