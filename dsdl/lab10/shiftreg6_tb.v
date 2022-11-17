`timescale 1ns/1ns
`include "shiftreg6.v"

module shiftreg6_tb();
reg inp;
reg clk;
wire o;

shiftreg6 q5(inp,clk,o);
always #10 clk = ~clk;
initial
begin
    $dumpfile("shiftreg6.vcd");
    $dumpvars(0,shiftreg6_tb);
    clk = 1;
    #200 $finish;
end
initial
begin
    inp = 1; #30;
    inp = 0; #20;
    inp = 1; #20;
    inp = 1; #20;
    inp = 0; #20;
    inp = 0; #20;
	$display("test complete");
end
endmodule
