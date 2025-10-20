package microservice.base_source.server_health_api.grpc;


import org.springframework.grpc.server.service.GrpcService;

import com.example.grpcrest.grpc.HelloRequest;
import com.example.grpcrest.grpc.HelloResponse;
import com.example.grpcrest.grpc.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;

@GrpcService
public class HelloGrpcService extends HelloServiceImplBase {
	@Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String name = request.getName();
        String message = "Xin chào, " + name + "! Đây là phản hồi từ gRPC.";
        HelloResponse response = HelloResponse.newBuilder()
                .setMessage(message)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
