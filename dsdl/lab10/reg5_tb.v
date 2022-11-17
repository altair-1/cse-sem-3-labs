`timescale 1ns/1ns
`include "reg5.v"

module reg5_tb();
reg [4:0] inp;
reg clk,reset;
wire [4:0] o;

reg5 q4(inp,clk,reset,o);
always #10 clk = ~clk;
initial
begin
    $dumpfile("reg5_tb.vcd");
    $dumpvars(0,reg5_tb);
    clk = 1;
    #50 $finish;
end
initial
begin
    inp = 5'b00000; reset = 1; #10;
    inp = 5'b01011; reset = 0; #30;
    inp = 5'b01011; reset = 1; #10;
    $display("test complete");
end
endmodule
