`timescale 1ns/1ns
`include "q4.v"

module q4_tb();
reg [3:0] a;
reg [1:0] s;
wire f;

q4 f1(a,s,f);
initial
begin
	$dumpfile("q4_tb.vcd");
	$dumpvars(0,q4_tb);
	
	a = 4'b1010; 
	s = 2'b00; #20;
	s = 2'b01; #20;
	s = 2'b10; #20;
	s = 2'b11; #20;
	
	$display("test complete");

end 
endmodule
