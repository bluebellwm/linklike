<h1>Link Like</h1>

<g:form name="linkCreateForm" url="[action:'create']">
  Title: <g:textField name="title"/><br/>
  URL: <g:textField name="url"/><br/>
  <input type="submit" value="Add new link"/>
</g:form>

<hr>

<ul>
  <% if(links.size() == 0) { %>
    <li>No links</li>
  <% } else { %>
    <% for(link in links) { %>
      <g:form name="likelink" url="[action:'addLikes',id:link.id]">
      <li>
        Title : "<%= link.title %>" Url : "<%= link.url %>" Likes : <%= link.likes %>
      <input type="submit" value="Likes!"/>
      </li>
      </g:form>
    <% } %> 
  <% } %>
</ul>