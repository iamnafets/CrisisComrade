package database

import org.squeryl._
import PrimitiveTypeMode._
import adapters.MySQLAdapter

class Test(val id: Long, val value: String) extends KeyedEntity[Long]

object Library extends Schema {
  val tests = table[Test]

  on(tests)(s => declare(
    s.id    is(unique,indexed),
    s.value is(indexed,dbType("varchar(255)")),

    columns(s.id,s.value) are (indexed)
  ))
}
