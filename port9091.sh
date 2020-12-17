kubectl delete svc grpc-serv
kubectl expose deployment grpc-serv --type=LoadBalancer --port=9091

minikube service grpc-serv