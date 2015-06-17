//import org.apache.SparkContext
//import org.apache.SparkContext._
//import org.apache.SparkConf

//object dadosHidro {
//  def main(args: Array[String]) {
//    val conf = new SparkConf().setAppName("Dados Hidrológicos)
//    val sc = new SparkContext(conf)
    val lines = sc.textFile("CHUVAS.TXT*")
    val usefulLines = lines.filter(line => line.constains(";"))
    val pairs = usefulLines.map(x => (x.split(";")(0), x.split(";").drop(1)))
    pairs take 5 foreach println
//  }
//}
