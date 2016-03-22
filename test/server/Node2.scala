import com.redsift.ComputeRequest;
import com.redsift.ComputeResponse;

object Node2 {
  def compute(req: ComputeRequest): Array[ComputeResponse] = {
    println(req.toString());
    val res = new ComputeResponse("bucket-scala2", "key-scala2", "value-scala2", 0);
    return Array[ComputeResponse](res);
  }
}
