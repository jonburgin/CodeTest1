package codeTest1

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class  CodeTest1Suite extends FunSuite{

  test ("addition"){
    val foo = 1 + 1
    assert(foo == 2)
  }

}


