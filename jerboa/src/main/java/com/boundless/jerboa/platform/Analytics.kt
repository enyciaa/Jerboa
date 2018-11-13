package com.boundless.jerboa.platform

interface Analytics {

    fun event(tag: String)

    fun event(
            tag: String,
            property: String,
            propertyValue: String
    )

    fun event(
            tag: String,
            property: String,
            propertyValue: String,
            propertyTwo: String,
            propertyTwoValue: String
    )

    fun purchase(
            price: Double,
            currencyShortCode: String,
            itemName: String
    )

    fun exception(
            message: String,
            stackTraceElements: Array<StackTraceElement>
    )

    fun exception(throwable: Throwable)

}
