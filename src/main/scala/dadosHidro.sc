//import org.apache.SparkContext
//import org.apache.SparkContext._
//import org.apache.SparkConf

//object dadosHidro {
//  def main(args: Array[String]) {
//    val conf = new SparkConf().setAppName("Dados Hidrológicos)
//    val sc = new SparkContext(conf)
    val lines = sc.textFile("CHUVAS.TXT*")
    val rainStats = lines.filter(line => line.contains(";") && !line.contains("//"))
    val statsPerStation = rainStats.map(x => (x.split(";")(0), x.split(";").drop(1)))
    statsPerStation take 5 foreach println
//  }
//}
