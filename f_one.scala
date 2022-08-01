object f_one{
  def interestValue(deposit:Double)
{
    if(deposit<=20000)
    {
       println("Interset : Rs. " + deposit*0.02);
    }
    else if(deposit<=200000)
    {
       println("Interset : Rs. " + deposit*0.04);
    }
    else if(deposit<=2000000)
    {
       println("Interset : Rs. " + (deposit*0.035+deposit*0.065));
    }
    else
    {
       println("Interset : Rs. " + deposit*0.065);
    }
   
  }

  def main(args:Array[String])={
    println("Enter the deposit: ")
    val deposit = scala.io.StdIn.readDouble();
    interestValue(deposit) 
}
}
