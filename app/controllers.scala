package controllers

import play._
import play.mvc._
import play.db._
import org.squeryl._
import PrimitiveTypeMode._
import adapters.MySQLAdapter
import database._

object Application extends Controller with Secure {
    
    import views.Application._
    
    def index = {
        html.index("Your Scala application is ready!")
    }

    def sayHello = {
      SessionFactory.concreteFactory = Some(() =>
        Session.create(DB.getConnection(), new MySQLAdapter)
      )

      /*
      inTransaction {
        import Library._

        drop
        create
        printDdl

        tests.insert(new Test("Yes"))
        tests.insert(new Test("No"))
        tests.insert(new Test("Maybe"))
      }
      */

      html.sayHello(params.get("myName"))
    }
}
