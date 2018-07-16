package com.boundless.jerboa.platform

interface ResourceProvider {

  fun getString(stringRes: Int): String

  fun getStringArray(stringArrayRes: Int): List<String>
}