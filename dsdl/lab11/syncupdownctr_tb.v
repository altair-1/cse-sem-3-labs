`timescale 1ns/1ns
`include "syncupdownctr.v"
module syncupdownctr_tb();
reg x,clock, Resetn;
wire[3:0] Q;
integer i;
syncupdownctr q5(x,clock,Resetn, Q);

initial
begin
$dumpfile("syncupdownctr_tb.vcd");
$dumpvars(0, syncupdownctr_tb);
clock=0;
forever #10 clock = ~clock;
end

initial
begin
x=0;
Resetn=0; #20;
Resetn=1; #300;
x=1;
Resetn=0; #20;
Resetn=1; #300;
$display("test complete");
$finish;
end
endmodule
