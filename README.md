**A simple scroll performance test.**

Demo on low end hardware: 

https://user-images.githubusercontent.com/7142273/191780198-30f7a31f-cf65-4633-b7d4-020c3bfb0f3c.mp4

This is a video of a release build, R8'd in full mode, AOT compiled.

Note: on the same device, a recyclerview doesn't have jank when scrolled/flung.

[Here is a trace file of a single janky fling.](https://github.com/grahamearley/compose-scroll-test/blob/main/trace_file.perfetto-trace)
