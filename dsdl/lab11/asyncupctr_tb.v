`timescale 1ns/1ns
`include "asyncupctr.v"
module asyncupctr_tb();
reg clock, Resetn;
wire[3:0] Q;
integer i;
asyncupctr q3(clock,Resetn, Q);

initial
begin
$dumpfile("asyncupctr_tb.vcd");
$dumpvars(0, asyncupctr_tb);
clock=0;
forever #10 clock = ~clock;
end

initial
begin
Resetn=0; #10;
Resetn=1; #300;
$display("test complete");
$finish;
end
endmodule
