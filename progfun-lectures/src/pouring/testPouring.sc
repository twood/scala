package pouring

object testPouring {
  val problem = new Pouring(Vector(7, 9, 11, 19)) //> problem  : pouring.Pouring = pouring.Pouring@923ef32
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with p
                                                  //| ouring.testPouring.problem.Move] = Vector(Empty(0), Empty(1), Empty(2), Empt
                                                  //| y(3), Fill(0), Fill(1), Fill(2), Fill(3), Pour(0,1), Pour(0,2), Pour(0,3), P
                                                  //| our(1,0), Pour(1,2), Pour(1,3), Pour(2,0), Pour(2,1), Pour(2,3), Pour(3,0), 
                                                  //| Pour(3,1), Pour(3,2))
                                                  
  problem.pathSets.take(3).toList                 //> res1: List[Set[pouring.testPouring.problem.Path]] = List(Set( --> Vector(0, 
                                                  //| 0, 0, 0)), Set(Fill(0) --> Vector(7, 0, 0, 0), Fill(1) --> Vector(0, 9, 0, 0
                                                  //| ), Fill(2) --> Vector(0, 0, 11, 0), Fill(3) --> Vector(0, 0, 0, 19)), Set(Fi
                                                  //| ll(3) Pour(3,2) --> Vector(0, 0, 11, 8), Fill(1) Pour(1,2) --> Vector(0, 0, 
                                                  //| 9, 0), Fill(3) Pour(3,1) --> Vector(0, 9, 0, 10), Fill(0) Fill(2) --> Vector
                                                  //| (7, 0, 11, 0), Fill(0) Fill(1) --> Vector(7, 9, 0, 0), Fill(3) Fill(2) --> V
                                                  //| ector(0, 0, 11, 19), Fill(2) Pour(2,1) --> Vector(0, 9, 2, 0), Fill(2) Pour(
                                                  //| 2,3) --> Vector(0, 0, 0, 11), Fill(1) Pour(1,3) --> Vector(0, 0, 0, 9), Fill
                                                  //| (2) Fill(1) --> Vector(0, 9, 11, 0), Fill(0) Pour(0,2) --> Vector(0, 0, 7, 0
                                                  //| ), Fill(1) Pour(1,0) --> Vector(7, 2, 0, 0), Fill(2) Pour(2,0) --> Vector(7,
                                                  //|  0, 4, 0), Fill(2) Fill(0) --> Vector(7, 0, 11, 0), Fill(1) Fill(3) --> Vect
                                                  //| or(0, 9, 0, 19), Fill(0) Pour(0,1) --> Vector(0, 7, 0, 0), Fill(3) Fill(0) -
                                                  //| -> Vector(7, 0, 0, 19), 
                                                  //| Output exceeds cutoff limit.
  problem.solution(18)                            //> res2: Stream[pouring.testPouring.problem.Path] = Stream(Fill(2) Pour(2,3) Fi
                                                  //| ll(0) Pour(0,3) --> Vector(0, 0, 0, 18), ?)
}