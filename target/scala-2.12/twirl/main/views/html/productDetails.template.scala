
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

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Details</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*40.10*/for(p<-products) yield /*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
          """),format.raw/*41.11*/("""<tr>
            """),_display_(/*42.14*/if(env.resource("public/images/productImages/thumbnails/"+p.getId +".jpg").isDefined)/*42.99*/{_display_(Seq[Any](format.raw/*42.100*/("""
              """),format.raw/*43.15*/("""<td><img src="/assets/images/productImages/thumbnails"""),_display_(/*43.69*/(p.getId + ".jpg")),format.raw/*43.87*/(""""/></td>
            """)))}/*44.15*/else/*44.20*/{_display_(Seq[Any](format.raw/*44.21*/("""
              """),format.raw/*45.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage/.jpg"/></td>
            """)))}),format.raw/*46.14*/("""
            """),format.raw/*47.13*/("""<td class="numeric">"""),_display_(/*47.34*/p/*47.35*/.getId),format.raw/*47.41*/("""</td>
            <td>"""),_display_(/*48.18*/p/*48.19*/.getName),format.raw/*48.27*/("""</td>
            <td>"""),_display_(/*49.18*/p/*49.19*/.getCategory.getName),format.raw/*49.39*/("""</td>        
            <td>"""),_display_(/*50.18*/p/*50.19*/.getDescription),format.raw/*50.34*/("""</td>
            <td  class="numeric">"""),_display_(/*51.35*/p/*51.36*/.getStock),format.raw/*51.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*52.37*/("%.2f".format(p.getPrice))),format.raw/*52.64*/("""</td>
            <td>
              <a href=""""),_display_(/*54.25*/routes/*54.31*/.HomeController.updateProduct(p.getId)),format.raw/*54.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
        
              
            </td>
          </tr>
        """)))}),format.raw/*61.10*/("""
      """),format.raw/*62.7*/("""</tbody>

    </table>


   
    </p>
  </div>
</div>""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 19:09:49 GMT 2018
                  SOURCE: /home/wdd/webapps/lab1/app/views/productDetails.scala.html
                  HASH: 32ba270a86972fc30a950f84db1f3903f73ece93
                  MATRIX: 1032->1|1247->120|1275->123|1304->144|1343->146|1371->148|1551->301|1566->307|1611->331|1689->383|1725->403|1765->405|1801->414|1838->424|1853->430|1904->460|1958->487|1968->488|1997->496|2036->507|2084->528|2094->529|2134->548|2192->576|2224->581|2368->699|2409->731|2449->733|2485->742|2557->787|2571->792|2607->807|2643->816|2687->830|2721->837|3040->1129|3072->1145|3112->1147|3151->1158|3196->1176|3290->1261|3330->1262|3373->1277|3454->1331|3493->1349|3534->1372|3547->1377|3586->1378|3629->1393|3748->1481|3789->1494|3837->1515|3847->1516|3874->1522|3924->1545|3934->1546|3963->1554|4013->1577|4023->1578|4064->1598|4122->1629|4132->1630|4168->1645|4235->1685|4245->1686|4275->1695|4344->1737|4392->1764|4466->1811|4481->1817|4540->1855|4754->2038|4788->2045
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|79->47|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|86->54|86->54|86->54|93->61|94->62
                  -- GENERATED --
              */
          