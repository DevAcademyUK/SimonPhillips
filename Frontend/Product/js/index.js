import { gateway as MoltinGateway } from '@moltin/sdk';

const Moltin = MoltinGateway ({
  client_id: "HqmlJAINgPFS7DTLaiCVsLh1H2WWCnR8hqVN4Fnwgq";
});

//Node.js
const MoltinGateway = require("@moltin/sdk").gateway

const Moltin = MoltinGateway ({
  client_id: "HqmlJAINgPFS7DTLaiCVsLh1H2WWCnR8hqVN4Fnwgq";
  client_secret: "ACzWvDI4kl2PZmRPA8c5csaiWRtXTldH8NlxvaUe7Q";
});

Moltin.Authenticate().then(response => {
  console.log("authenticated", response);
});

Moltin.Products.Limit(2)
  .All()
  .then(products => {
    // DO Something
  });

//Stripe confirguration
Moltin.Orders.Payment("orderId", {
  gateway: "stripe",
  method: "purchase",
  payment: "tok_visa"
}).then(() => {
  //Do Something
});

Moltin.Orders.Payment("orderId", {
  gateway: "manual",
  method: "authorize"
}).then(() => {
  //Do something
});
