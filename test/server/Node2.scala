import io.redsift.ComputeRequest;
import io.redsift.ComputeResponse;

object Node2 {
  def compute(req: ComputeRequest): Array[ComputeResponse] = {
    println("Node2.scala: " + req.toString());
    val res = new ComputeResponse("bucket-scala2", "key-scala2", "value-scala2", 0);
    return Array[ComputeResponse](res);
  }
}
