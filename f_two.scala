object f_two {
  def main(args: Array[String])
  {
    print("Enter the integer value :  ");
    var num =scala.io.StdIn.readInt();
    num match{
    case x if num % 2 ==0 && num>0 => println("Even");
    case x if num % 2 !=0 && num>0 => println("Odd")
    case x if num <= 0    => println("Negative/Zero");
    }
  }
}

  
