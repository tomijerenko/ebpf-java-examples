# Tracing Java application using bpftrace
```
# Compile and run the Java SpringBoot API
cd springboot-api
mvn clean package
java -XX:+DTraceMethodProbes -jar target/api-1.0.0.jar

# Start ebpf tracing
sudo bpftrace bpftrace_examples/usdt_method__entry.bt -o traces.txt

# Run the curl test script
./curltest.sh

# Check the traces.txt after curl script exits
```
