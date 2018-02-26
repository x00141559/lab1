
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Products" )/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""class="active"""")))}),format.raw/*26.60*/(""">
                    <a href="#">About</a>
                </li>

                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*37.22*/if(title=="Product Details" )/*37.51*/{_display_(Seq[Any](format.raw/*37.52*/("""class="active"""")))}),format.raw/*37.67*/(""">
                    <a href="#">Product Details</a>
                </li>
                <li """),_display_(/*40.22*/if(title=="Login")/*40.40*/{_display_(Seq[Any](format.raw/*40.41*/("""class="active"""")))}),format.raw/*40.56*/(""">
                    """),_display_(/*41.22*/if(user != null)/*41.38*/ {_display_(Seq[Any](format.raw/*41.40*/("""
                        """),format.raw/*42.25*/("""<a href=""""),_display_(/*42.35*/routes/*42.41*/.LoginController.logout()),format.raw/*42.66*/("""">Logout """),_display_(/*42.76*/user/*42.80*/.getName()),format.raw/*42.90*/("""</a>
                    """)))}/*43.23*/else/*43.28*/{_display_(Seq[Any](format.raw/*43.29*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/routes/*44.41*/.LoginController.login()),format.raw/*44.65*/("""">Login</a>
                    """)))}),format.raw/*45.22*/("""

                """),format.raw/*47.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*57.18*/content),format.raw/*57.25*/("""
            """),format.raw/*58.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("javascripts/main.js")),format.raw/*72.65*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 19:13:40 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/main.scala.html
                  HASH: 74df93c9bef229918bd9cba4dc020fb48f6afce2
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1915->695|1946->717|1985->718|2031->733|2322->997|2360->1026|2399->1027|2445->1042|2569->1139|2596->1157|2635->1158|2681->1173|2731->1196|2756->1212|2796->1214|2849->1239|2886->1249|2901->1255|2947->1280|2984->1290|2997->1294|3028->1304|3073->1331|3086->1336|3125->1337|3178->1362|3215->1372|3230->1378|3275->1402|3339->1435|3385->1453|3548->1589|3576->1596|3617->1609|3925->1890|3940->1896|4001->1936
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|69->37|69->37|69->37|69->37|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|77->45|79->47|89->57|89->57|90->58|104->72|104->72|104->72
                  -- GENERATED --
              */
          