<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/WEB-INF/jsp/header.jsp" %>
 
 <div class="main-container">
          <div class="navbar hidden-desktop">
            <div class="navbar-inner">
              <div class="container">
                <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar">
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                </a>
                <div class="nav-collapse collapse navbar-responsive-collapse">
                  <ul class="nav">
                    <li>
                      <a href="#">My Class Room</a>
                    </li>
                    
                    <li>
                      <a href="#">My Rewards(<span id="Span1">1</span>)</a>
                    </li>
                    <li>
                      <a href="#">Messages(<span id="Span2">2</span>)</a>
                    </li>
                    <li>
                      <a href="#">My Requests</a>
                    </li>
                    <li>
                      <a href="#">Settings</a>
                    </li>
                    <li>
                      <a href="#">Forum</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

          <div class="row-fluid">

            <section class="span8">
              <div class="widget">
                <div class="black-board">
                    Black Board
                </div>
                <div class="widget-header">
                  <div class="title">
                    <span class="fs1" ><img src="/quest/Images/message_subicon.png"/></span> Message
                  </div>
                </div>
                  <div class="widget-body">
                  <textarea style="height: 111px" placeholder="Can I borrow book from  Somebody in the class please?" class="input-block-level " id="txtMessage"></textarea>
                    <button class="btn btn-primary pull-right" style="width:65px;height:30px;">post</button>
                  </div>
                <div class="widget-header" style="margin-top:60px;">
                  <div class="title">
                    <span class="fs1" ><img src="/quest/Images/teachersnote_subicon.png"/></span> Teacher's Note
                  </div>
                </div>
                  <div class="widget-body">
                  <div id="TeacherNote">
                      <ol>
                          <li>
                              You should finish the examination by 5 today
                          </li>
                          <li>
                              Call me by 4 PM and update me.
                          </li>
                      </ol>
                  </div>

                  </div>
                <div class="widget-header" style="">
                  <div class="title">
                    <span class="fs1" ><img src="/quest/Images/news_subicon.png"/></span> News
                  </div>
                </div>
                  <div class="widget-body">
                    <div class="viewport">
                      <div class="overview">
                        <div id="chats">
                          <div class="tab-widget">
                            <ul class="chats">
                              <li>
                                <section class="user pull-left">
                                  <img src="/quest/Images/userchat.jpg" alt="user" >
                                </section>
                                <section class="info">
                                  <h5>Link to first article</h5>
                                  <small>Esque vehicula arcu orci, quis faucibus elit pretium aliquam.Integer quam erat, gravida in vulputate.
                                         Esque vehicula arcu orci, quis faucibus elit pretium aliquam.Integer quam erat, gravida in vulputate
                                  </small>
                                </section>
                                <section class="post-time pull-right">
                                  <h3>25</h3><span>Dec</span>
                                </section>
                              </li>
                              <li>
                                <section class="user pull-left">
                                  <img src="/quest/Images/userchat.jpg" alt="user" >
                                </section>
                                <section class="info">
                                  <h5>Link to second article</h5>
                                  <small>Esque vehicula arcu orci, quis faucibus elit pretium aliquam.Integer quam erat, gravida in vulputate.
                                      Esque vehicula arcu orci, quis faucibus elit pretium aliquam.Integer quam erat, gravida in vulputate
                                  </small>
                                </section>
                                <section class="post-time pull-right">
                                  <h3>15</h3><span>Jan</span>
                                </section>
                              </li>
                            </ul>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
              </div>
            </section>

            <section class="span4">
              <div class="widget">
                <div class="widget-header" style="margin-top:0px;">
                  <div class="title">
                    <span class="fs1" ><img src="/quest/Images/events_subicon.png"/></span> Upcoming Events
                  </div>
                </div>
                <div class="widget-body">
                  <div class="todo-container">
                      
            <div class="span12">
              <div id="gallery" data-toggle="modal-gallery" data-target="#modal-gallery">
                <div class="row-fluid">
                  <a class="thumbnail-img span6" data-gallery="gallery" href="#" title="Event 1">
                  <img src="/quest/Images/event1.jpg"  alt="Event 1">
                      <p>Event 1</p>
                  </a>
                  <a class="thumbnail-img span6" data-gallery="gallery" href="#" title="Event 2">
                    <img src="/quest/Images/event2.jpg" alt="Event 2"/>
                      <p>Event 2</p>
                  </a>
                </div>
                <div class="row-fluid">
                  <a class="thumbnail-img span6" data-gallery="gallery" href="#" title="Event 3">
                  <img src="/quest/Images/event1.jpg" alt="Event 3">
                      <p>Event 3</p>
                  </a>
                  <a class="thumbnail-img span6" data-gallery="gallery" href="#" title="Event 4">
                    <img src="/quest/Images/event2.jpg" alt="Event 4">
                      <p>Event 4</p>
                  </a>
                  
                </div>            
              <div class="row-fluid">
                <a class="btn btn-primary view" href="#">view all</a>
              </div>
                  </div>
                </div>
              </div>
            </div>
                <div class="widget-header">
                  <div class="title">
                    <span style="color:#3B80BD;"><span class="fs1" ><img src="/quest/Images/friends_subicon.png"/></span>   Friends (<span id="frndCound"><a href="#" style="color:#3B80BD; text-decoration:underline;">63</a></span>)</span>
                     <span style="padding-right:10px;">Teacher (<span id="teacherCount"><a href="#"style="text-decoration:underline;">2</a></span>)</span>
                  </div>
                </div>
                  <div class="widget-body" id="friendlist">
                    <div class="viewport">
                      <div class="overview">
                        <div id="Div1">
                          <div class="tab-widget">
                            <ul class="chats">
                              <li>
                                <section class="user pull-left">
                                  <img src="/quest/Images/userchat.jpg" alt="user" >
                                </section>
                                <section class="info">
                                  <p>Ben</p>
                                  <p>Grossman</p>
                                  <p style="color:#858585;">Princeton <a href="#" style="color:#3B80BD;"><span data-icon="&#xe06d;" aria-hidden="true" class="fs1"></span>  Chat </a></p>
                                </section>
                              </li>
                              <li>
                                <section class="user pull-left">
                                  <img src="/quest/Images/userchat.jpg" alt="user" >
                                </section>
                                <section class="info">
                                  <p>Anand</p>
                                  <p>Athavale</p>
                                  <p>Boston, MA  <a href="#""><span data-icon="&#xe06d;" aria-hidden="true" class="fs1"></span>  Chat </a></p>
                                </section>
                              </li>
                              <li>
                                <section class="user pull-left">
                                  <img src="/quest/Images/userchat.jpg" alt="user" >
                                </section>
                                <section class="info">
                                  <p>Andy</p>
                                  <p>Goose</p>
                                  <p>Boston, MA  <a href="#""><span data-icon="&#xe06d;" aria-hidden="true" class="fs1"></span>  Chat </a></p>
                                </section>
                              </li>
                            </ul>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                <div class="widget-header">
                  <div class="title">
                    <span class="fs1" ><img src="/quest/Images/advertisment_subicon.png"/></span> Advertisement
                  </div>
                </div>
                  <div class="widget-body">
                      <img style="width:100%;" src="/quest/Images/advertisment.jpg" id="advertisementImage"/>
                      <section class="info">
                         <small>Esque vehicula arcu orci, quis faucibus elit pretium aliquam.Integer quam erat, gravida in vulputate.</small>
                      </section>
                  </div>
          </div>

        </section> 

        </div>
       </div>
       
     <%@ include file="/WEB-INF/jsp/footer.jsp" %>