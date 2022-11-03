`timescale 1ns/1ns
`include "q3.v"
module q3_tb();
reg [2:0]i;
reg En;
wire f;
integer j;
q3 f1(i,f,En);
initial
begin
$dumpfile("q3_tb.vcd");
$dumpvars(0,q3_tb);
En=1'b1;
for(j=0;j<8;j=j+1)
begin
i=j; #20;
end
$display("test complete");
end
endmodule
