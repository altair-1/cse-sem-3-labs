`timescale 1ns/1ns
`include "syncupctr.v"
module syncupctr_tb();
reg clock, Resetn;
wire[3:0] Q;
integer i;
syncupctr q4(clock,Resetn, Q);

initial
begin
$dumpfile("syncupctr_tb.vcd");
$dumpvars(0, syncupctr_tb);
clock=0;
forever #10 clock = ~clock;
end

initial
begin
Resetn=0; #20;
Resetn=1; #300;
$display("test complete");
$finish;
end
endmodule
