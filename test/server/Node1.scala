import com.redsift.ComputeRequest;
import com.redsift.ComputeResponse;

package server {
    object Node1 {
      def compute(req: ComputeRequest): ComputeResponse = {
        println(req.toString());
        val res = new ComputeResponse("bucket-scala", "key-scala", "value-scala", 0);
        return res;
      }
    }
}
