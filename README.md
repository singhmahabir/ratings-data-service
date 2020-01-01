# ratings-data-service

>	- input -> userId
>	- output -> bookId's with rating and comment of users

##### Exposed URL below

> * GET  localhost:9093/ratings/{userId}
> * POST localhost:9093/ratings/user


``data.sql`` which is available in src/main/resources will exucuted at the time of deployment 

Here ``name must`` be same as data.sql

```
insert into User
values(hibernate_sequence.NEXTVAL,'1234','Good book for java ',4, 'msdeo4u');

insert into User
values(hibernate_sequence.NEXTVAL,'2345','Average book ',3, 'msdeo4u');

POST Body 
{
	"userId": "msdeo",
	"bookId": "1234",
    "rating": 3,
    "comment": "Average book"
}
```

#### Zipkin Client 

```
    @Autowired
    private Tracer tracer;
    
    @RequestMapping(value="/customer/{cid}/vehicledetails", method=RequestMethod.GET)
    public @ResponseBody String getCustomerVehicleDetails(@PathVariable Integer cid)  throws InterruptedException {
        
        String result;
        
        Span s = this.tracer.createSpan("lookupvehicle");
        try {
            //add tags
            this.tracer.addTag("customerid", cid.toString());
            
            s.logEvent("DB query started");
            
            Thread.sleep(500);
            
            Hashtable<Integer, String> vehicles = new Hashtable<Integer, String>();
            vehicles.put(100, "Lincoln Continental; Plate SNUG30");
            vehicles.put(101, "Chevrolet Camaro; Plate R7TYR43");
            vehicles.put(102, "Volkswagen Beetle; Plate 6CVI3E2");
            
            result = vehicles.get(cid);
            
            s.logEvent("DB query completed");
        }
        finally {
            this.tracer.close(s);
        }
        
        return result;
    }
```