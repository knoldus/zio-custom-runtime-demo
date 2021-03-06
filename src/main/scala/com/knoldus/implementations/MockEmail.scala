package com.knoldus.implementations

import com.knoldus.abstracts.Email
import zio.{Task, ZIO}

case class MockEmail() extends Email {
  override def send(user: String, content: String): Task[Unit] =
    ZIO.effect(println(s"To  : $user \nBody:\n$content"))
}