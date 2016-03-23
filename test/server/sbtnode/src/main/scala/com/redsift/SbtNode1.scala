import com.redsift.ComputeRequest;
import com.redsift.ComputeResponse;

package com.redsift {
    object SbtNode1 {
        def compute(req: ComputeRequest): ComputeResponse = {
            println("SbtNode1.scala: " + req.toString());
            val res = new ComputeResponse("bucket-sbt", "key-sbt", "value-sbt", 0);
            return res;
        }
    }
}
