object f_three{

  def toUpper(S:String):String={
   S.toUpperCase();
  }

  def toLower(S:String):String={
    S.toLowerCase();
  }
  
  def formatNames(name:String)(func: String=>String):String= {
    func(name)
  }

  def main(Args:Array[String])
  {
    println("Enetr the name: ")
    val name = scala.io.StdIn.readLine()
    println("\nIf you want to change name to")
    println("Upper case enter 1")
    println("Lower case enter 2\n")
    println("Enter the choice: ")
    val n = scala.io.StdIn.readInt();
    
    if(n==1)
    {
      println(formatNames(name)(toUpper(_)))
    }
    else if(n==2)
    {
      println(formatNames(name)(toLower(_)))
    }
  }
}
