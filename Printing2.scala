import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Printing2 {
 
  
  def main(args:Array[String]){
    println("printing")
    
   val Config1=new SparkConf().setAppName("App2").setMaster("local[*]")
   val sc2=new SparkContext(Config1) 
   sc2.setLogLevel("ERROR")
  
   val list=List("apples","cherrys","banana","Grapes")
   val rdd=sc2.parallelize(list)
   rdd.map(x=>x).foreach(println)
    
   
  }
  
}
