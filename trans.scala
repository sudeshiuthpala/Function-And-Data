object trans extends App{
  val acc1=new account("9852",231800,100320.50)
  val acc2=new account("5623",231801,60000.00)
  println(acc1)
  acc1.transfer(acc2,320.50)
  println(acc2)
  println(acc1)
}
class account(id:String,n:Int,b:Double){
  val nic:String=id// IDEA:
  val acnumber:Int=n// NOTE:
  var balance :Double=b// BUG:
  override def toString= nic + " " +acnumber+ " " +balance
  def withdraw(a:Double)=
    {this.balance=this.balance-a}
  def deposit(a:Double)=
    this.balance= this.balance+a
  def transfer(a:account,b:Double)={
    this.withdraw(b)
    a.deposit(b)
  }
}
