package com.biosimilarity.evaluator.importer.dtos

import scala.collection.Map

/**
 * Transfer object for createUserRequest.
 */
case class CreateUserRequest(
  email: String,
  password: String,
  jsonBlob: String
) extends RequestContent

case class UpdateUserRequest(
  sessionURI: String,
  jsonBlob: String
) extends RequestContent
