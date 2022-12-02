package com.wizardworld.controllers

import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.filter.Filter
import ch.qos.logback.core.spi.FilterReply

class SampleFilter: Filter<ILoggingEvent>() {
    override fun decide(event: ILoggingEvent): FilterReply {
        return if (event.message.contains("Spring")){
            FilterReply.ACCEPT
        }else{
            FilterReply.DENY
        }
    }
}