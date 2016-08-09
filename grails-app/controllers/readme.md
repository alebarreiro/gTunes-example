## Controller Scopes

- request: Objects placed into the request are kept for the duration of the currently executing request.
- flash: Objects placed into flash are kept for the duration of the current request and the next request only.
    - Data stored in a map. (Implements java.util.Map)
    - Usage: Processing and then redirect the request to another controller, servlet, etc. without losing the request data for the next request (only).
- session: Objects placed into the session are kept until the user session is invalidated, either manually or through expiration.
- servletContext: Objects placed into the servletContext are shared across the entire application and kept for the lifetime of the application.

## Request params

via params Property

```{groovy}
def userName = params.userName
def age = params.int('age') //Params type conversion
```

## Redirect a request

- Simple redirect (Same controller, another action)
```{groovy}
class SampleController {
  def first() {
    // redirect to the "second" action...
    redirect action: "second"
  }
  def second() {
    // ...
  }
}
```
- Redirect to an Action in another Controller
```{groovy}
  redirect action: "list", controller: "store"
```