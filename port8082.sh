kubectl delete svc grpc-serv
kubectl expose deployment grpc-serv --type=LoadBalancer --port=8082

minikube service grpc-serv