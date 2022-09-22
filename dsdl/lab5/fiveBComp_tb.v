`timescale 1ns/1ns
`include "fiveBComp.v"
module fiveBComp_tb();
reg [4:0] a, b;
wire agtb, aeqb, altb;
fiveBComp fbc(a, b, agtb, aeqb, altb);
initial begin
	$dumpfile("fiveBComp_tb.vcd");
	$dumpvars(0, fiveBComp_tb);
	
	a=5'b00000; b=5'b00001;
	#20;
	
	a=5'b00001; b=5'b00001;
	#20;
	
	a=5'b00001; b=5'b00000;
	#20;
	
	$display("test complete");
end 
endmodule
	 
