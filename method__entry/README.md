# Listening USDT probes for java hotspot:method__entry
```
# Start ebpf tracing
sudo bpftrace bpf_method_entry.bt

# Compile and run the Java program
javac HelloEBPF.java
java -XX:+DTraceMethodProbes HelloEBPF
```
