package com.github.tomdom.dummy.backend

import collection.immutable.Seq
import scala.concurrent.Future

case class DataRow(id: Int, name: String)

trait DataService {
  def dataRows(): Future[Seq[DataRow]]
}

class DummyDataService extends DataService {
  override def dataRows(): Future[Seq[DataRow]] =
    Future.successful(for (i <- 0 to 5) yield DataRow(i, s"data row $i"))
}
