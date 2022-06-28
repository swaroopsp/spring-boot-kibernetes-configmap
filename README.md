#mvn compile jib:build

#mvn compile jib:dockerBuild

#docker run -p 8080:8080 7d8b7fc47d4e

#docker exec -it 33980f871780 sh



#docker rm -vf $(docker ps -aq)
#docker rmi -f $(docker images -aq)
#docker system prune -a --volumes
#docker ps -q | % { docker stop $_ }
#docker container stop $(docker container list -q)

#https://stackoverflow.com/questions/53669151/java-11-application-as-lightweight-docker-image


# `minikube start` - start the kubernetes simulator
# `kubectl apply -f .\config-map.yaml` - Apply the deployment config
# `kubectl apply -f .\deployment.yaml` - Apply the deployment config
# `kubectl get pod` - To get the pod
# `kubectl port-forward pod/spring-deployment--****** 8080:8080` - To port forward
# `kubectl port-forward service/spring-boot-jib-service 8080:8080` - To port forward

# `kubectl delete daemonsets,replicasets,services,deployments,pods,rc,ingress --all --all-namespaces` - To delete pods

# `kubectl delete configmap app-config     -n   default` - To delete config map

# `kubectl delete service my-spring-boot-service' - To delete service




# Actuator
##Request
http://localhost:8080/actuator/loggers/com.kibernetes.configmap.web

##response -
{
"configuredLevel": "INFO",
"effectiveLevel": "INFO"
}

#Change log level
##Request
curl --location --request POST 'http://localhost:8080/actuator/loggers/com.kibernetes.configmap.web' \
--header 'Content-Type: application/json' \
--data-raw '{"configuredLevel": "DEBUG"}'

##Response
204
