`timescale 1ns/1ns
`include "tff.v"

module tff_tb();
reg t,clk,reset;
wire q;

tff q2(t,clk,reset,q);
always #20 clk = ~clk;
initial
begin
    $dumpfile("tff_tb.vcd");
    $dumpvars(0,tff_tb);
    clk = 1;
    #110 $finish;
end
initial
begin
    t=1; reset=0;#20;
    t=1; reset=1;#20;
    t=1; reset=0;#10;
    t=0; reset=0;#20;
    t=1; reset=1;#10;
    t=0; reset=1;#30;
    $display("test complete");
end
endmodule
