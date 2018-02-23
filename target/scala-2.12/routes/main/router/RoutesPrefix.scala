
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/Lab1/conf/routes
// @DATE:Fri Feb 23 09:35:10 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
