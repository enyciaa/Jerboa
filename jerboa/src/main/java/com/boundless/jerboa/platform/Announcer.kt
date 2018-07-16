package com.boundless.jerboa.platform

interface Announcer {

  fun announce(text: String)

  fun announceLong(text: String)

  fun cancelAnnouncement()
}