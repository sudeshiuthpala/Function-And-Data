object banks extends App{
  var bank:List[account]=List()
}
class account(id:String,n:Int,b:Double){
  val nic:String=id// IDEA:
  val acnumber:Int=n// NOTE:
  var balance :Double=b// BUG:
  override def toString= nic + " " +acnumber+ " " +balance
  // def withdraw(a:Double)=
  //   {this.balance=this.balance-a}
  // def deposit(a:Double)=
  //   this.balance= this.balance+a
  // def transfer(a:account,b:Double)={
  //   this.withdraw(b)
  //   a.deposit(b)
  // }
  val find=(n:String,b:List[account])=>b.filter(x=>x.nic.equals(n))
  val overdraft=(b:List[account])=>b.filter(x=>x.balance < 0)
  val balance=(b:List[account])=>b.reduce((x.balance,y.balance)=>x.balance+y.balance)
  val interest=(b:List[account])=>b.map(x.balance match{
    case x if x>0 => x+x*.05
    case _ => x- x*0.1
  } )
}
