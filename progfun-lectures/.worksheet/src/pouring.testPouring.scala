package pouring

object testPouring {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
  val problem = new Pouring(Vector(7, 9, 11, 19));System.out.println("""problem  : pouring.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with pouring.testPouring.problem.Move] = """ + $show(res$0));$skip(85); val res$1 = 
                                                  
  problem.pathSets.take(3).toList;System.out.println("""res1: List[Set[pouring.testPouring.problem.Path]] = """ + $show(res$1));$skip(23); val res$2 = 
  problem.solution(18);System.out.println("""res2: Stream[pouring.testPouring.problem.Path] = """ + $show(res$2))}
}
