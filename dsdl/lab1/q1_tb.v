`timescale 1ns/1ns
`include "q1.v"
//Name of the Verilog file
module q1_tb();
reg a,b,c,d;
//Input
wire m;
//Output
q1 ex1(a,b,c,d,m); //Instantiation of the module
initial
begin
$dumpfile("q1_tb.vcd");
$dumpvars(0, q1_tb);
a=1'b0; b=1'b0; c=1'b0;d=1'b0;
#20;
a=1'b0; b=1'b0; c=1'b0;d=1'b1;
#20;
a=1'b0; b=1'b0; c=1'b1;d=1'b0;
#20;
a=1'b0; b=1'b0; c=1'b1;d=1'b1;
#20;
a=1'b0; b=1'b1; c=1'b0;d=1'b0;
#20;
a=1'b0; b=1'b1; c=1'b0;d=1'b1;
#20;
a=1'b0; b=1'b1; c=1'b1;d=1'b0;
#20;
a=1'b0; b=1'b1; c=1'b1;d=1'b1;
#20;
a=1'b1; b=1'b0; c=1'b0;d=1'b0;
#20;
a=1'b1; b=1'b0; c=1'b0;d=1'b1;
#20;
a=1'b1; b=1'b0; c=1'b1;d=1'b0;
#20;
a=1'b1; b=1'b0; c=1'b1;d=1'b1;
#20;
a=1'b1; b=1'b1; c=1'b0;d=1'b0;
#20;
a=1'b1; b=1'b1; c=1'b0;d=1'b1;
#20;

a=1'b1; b=1'b1; c=1'b1;d=1'b0;
#20;
a=1'b1; b=1'b1; c=1'b1;d=1'b1;
#20;

$display("Test complete");
end
endmodule
