`timescale 1ns/1ns
`include "dff.v"

module dff_tb();
reg d,clk,reset;
wire q;

dff q1(d,clk,reset,q);
always #20 clk = ~clk;
initial
begin
    $dumpfile("dff_tb.vcd");
    $dumpvars(0,dff_tb);
    clk = 0;
    #80 $finish;
end
initial
begin
    d=1; reset=1;#10;
    d=1; reset=0;#20;
    d=1; reset=1;#10;
    d=0; reset=1;#10;
    d=1; reset=0;#20;
    d=0; reset=0;#10;
    $display("test complete");
end
endmodule
